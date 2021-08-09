@echo off
cls
echo Processo de copia e Atualização de RPO
echo %date%
echo Passo 1 - Criando Backup
echo Backup em processamento...

echo Copia dos RPO: Em andamento.
copy C:\TOTVS12_PRODUCAO\Microsiga\Protheus\apo\tttp120.rpo C:\TOTVS12_PRODUCAO\Microsiga\Protheus\apoBackup

cd C:\TOTVS12_PRODUCAO\Microsiga\Protheus\apoBackup
ren tttp120.rpo %date:~6,4%%date:~3,2%%date:~0,2%.rpo 

echo Backup do RPO: Concluida.


echo Processo de copia e Atualizacao de RPO
echo %date%
echo Passo 2 - Atualizar RPO em producao
echo Atualizando RPO...

echo Atualizando RPO.
copy C:\TOTVS12_PRODUCAO\Microsiga\Protheus\apo1260\tttp120.rpo C:\TOTVS12_PRODUCAO\Microsiga\Protheus\apo

echo Atualizacao concluida...