net use \\192.168.0.10\Lobo\smartclient32 H1h2h3h4 /u:up

robocopy \\192.168.0.10\Lobo\smartclient32 C:\smartclient /e

net use \\192.168.0.10\Lobo\smartclient32 /delete

cls

echo concluido com exito
pause