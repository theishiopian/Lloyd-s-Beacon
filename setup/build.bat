@echo off
title Building Lloyd's Beacon...
echo Building Lloyd's Beacon...
echo.
cd ..
call gradlew.bat build
cd setup
echo.
pause
exit /b