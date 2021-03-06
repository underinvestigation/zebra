VERSION 1.0 CLASS
BEGIN
  MultiUse = -1  'True
  Persistable = 0  'NotPersistable
  DataBindingBehavior = 0  'vbNone
  DataSourceBehavior  = 0  'vbNone
  MTSTransactionMode  = 0  'NotAnMTSObject
END
Attribute VB_Name = "ScanPath"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = True
Attribute VB_PredeclaredId = False
Attribute VB_Exposed = True
Attribute VB_Ext_KEY = "SavedWithClassBuilder6" ,"Yes"
Attribute VB_Ext_KEY = "Top_Level" ,"Yes"
'/*
' * Copyright 2004 Anite - Central Government Division
' *    http://www.anite.com/publicsector
' *
' * Licensed under the Apache License, Version 2.0 (the "License");
' * you may not use this file except in compliance with the License.
' * You may obtain a copy of the License at
' *
' *    http://www.apache.org/licenses/LICENSE-2.0
' *
' * Unless required by applicable law or agreed to in writing, software
' * distributed under the License is distributed on an "AS IS" BASIS,
' * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
' * See the License for the specific language governing permissions and
' * limitations under the License.
' */
Option Explicit
Private mcolFiles As Collection

Public Property Get FileList() As Collection
    Set FileList = mcolFiles
End Property

Public Sub StartScan(Path As String, ExtMask As String)
    Dim strDir As String
    Dim strRoot As String
    Dim colPaths As Collection
    Set mcolFiles = New Collection
    Set colPaths = New Collection
    strRoot = ValidatePath(Path)
    colPaths.Add strRoot
    Do Until colPaths.Count = 0
        strRoot = colPaths(1)
        colPaths.Remove 1
        strDir = Dir$(strRoot & "*.*", vbDirectory Or vbNormal)
        Do Until Len(strDir) = 0
        
            If Not (strDir = "." Or strDir = "..") Then
                If (GetAttr(strRoot & strDir) And vbDirectory) = vbDirectory Then
                    colPaths.Add strRoot & strDir & "\"
                ElseIf LCase$(Right$(strDir, Len(ExtMask))) = LCase$(ExtMask) And (GetAttr(strRoot & strDir) And vbNormal) = vbNormal Then
                    mcolFiles.Add strRoot & strDir
                End If
            End If
            strDir = Dir$
        Loop
    Loop
End Sub
