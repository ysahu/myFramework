WinWait("[CLASS:#32770]","",10)
ControlFocus("File Upload","","Edit1")
Sleep(100)
ControlSetText("File Upload","","Edit1","aaa.pdf")
Sleep(100)
ControlClick("File Upload","","Button1");