FROM mcr.microsoft.com/dotnet/framework/aspnet:6.0-windowsservercore-ltsc2019
ARG source
WORKDIR /inetpub/wwwroot
ADD ${source:-bin\Release\net6.0\publish\} .