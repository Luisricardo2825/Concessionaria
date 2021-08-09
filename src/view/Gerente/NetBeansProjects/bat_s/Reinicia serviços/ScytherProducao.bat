@echo off
cls
:menu
cls

date /t

echo Computador: %computername%        Usuario: %username%
                   
echo            MENU TAREFAS
echo  ==================================
echo * 1. Parar Todos os Slaves.........* 
echo * 2. Parar Tudo....................*
echo * 3. Iniciar DBAcces...............*
echo * 4. Iniciar Todos os Slaves.......*
echo * 5. Sair..........................* 
echo  ==================================

set /p opcao= Escolha uma opcao: 
echo ------------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4
if %opcao% equ 5 goto opcao5
if %opcao% GEQ 6 goto opcao6

:opcao1
cls

echo "Stopping Services"

sc \\192.168.0.18 stop TOTVS-Appserver12-COLABORACAO
sc \\192.168.0.18 stop TOTVS-Appserver12-CAIXAS
sc \\192.168.0.18 stop TOTVS-Appserver12-MASTER_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE1_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE2_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE3_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE4_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE5_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE6_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE7_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE8_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE9_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE10_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE11_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE12_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE14_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE15_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE16_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE17_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE18_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE19_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE20_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE21_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE22_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE23_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE24_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE25_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE26_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE27_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE28_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE29_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE30_PRODUCAO
sc \\192.168.0.10 stop TOTVS-Appserver12-SLAVE31_PRODUCAO
sc \\192.168.0.10 stop TOTVS-Appserver12-SLAVE32_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-TELNET_PRODUCAO
sc \\192.168.0.18 stop TSS-Appserver12_PRODUCAO
sc \\192.168.0.10 stop TOTVS-Appserver12-Solucoes


echo ==================================
echo *      Serviços Parados          *
echo ==================================
pause
goto menu

:opcao2
cls

echo "Parando Tudo"

sc \\192.168.0.18 stop TOTVS-Appserver12-COLABORACAO
sc \\192.168.0.18 stop TOTVS-Appserver12-CAIXAS
sc \\192.168.0.18 stop TOTVS-Appserver12-MASTER_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE1_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE2_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE3_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE4_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE5_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE6_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE7_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE8_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE9_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE10_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE11_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE12_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE14_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE15_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE16_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE17_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE18_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE19_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE20_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE21_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE22_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE23_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE24_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE25_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE26_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE27_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE28_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE29_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-SLAVE30_PRODUCAO
sc \\192.168.0.18 stop TOTVS-Appserver12-TELNET_PRODUCAO
sc \\192.168.0.18 stop TSS-Appserver12_PRODUCAO
sc \\192.168.0.22 stop DBACCESS
sc \\192.168.0.18 stop licenseVirtual


echo ==================================
echo *       Tudo parado              *
echo ==================================
pause
goto menu

:opcao3
cls

echo "Iniciando DBAcces"

sc \\192.168.0.22 start DBACCESS

echo ==================================
echo *       DBAcces iniciado         *
echo ==================================
pause
goto menu

:opcao4
cls

echo "Starting Services"

sc \\192.168.0.18 start TOTVS-Appserver12-COLABORACAO
sc \\192.168.0.18 start TOTVS-Appserver12-CAIXAS
sc \\192.168.0.18 start TOTVS-Appserver12-MASTER_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE1_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE2_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE3_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE4_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE5_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE6_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE7_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE8_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE9_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE10_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE11_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE12_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE14_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE15_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE16_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE17_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE18_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE19_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE20_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE21_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE22_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE23_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE24_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE25_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE26_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE27_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE28_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE29_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-SLAVE30_PRODUCAO
sc \\192.168.0.10 start TOTVS-Appserver12-SLAVE31_PRODUCAO
sc \\192.168.0.10 start TOTVS-Appserver12-SLAVE32_PRODUCAO
sc \\192.168.0.18 start TOTVS-Appserver12-TELNET_PRODUCAO
sc \\192.168.0.18 start TSS-Appserver12_PRODUCAO
sc \\192.168.0.10 start TOTVS-Appserver12-Solucoes


echo ==================================
echo *      Serviços Iniciados        *
echo ==================================
pause
goto menu

:opcao5
cls
exit

:opcao6
echo ==============================================
echo * Opcao Invalida! Escolha outra opcao do menu *
echo ==============================================
pause
goto menu