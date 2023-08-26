FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS build
WORKDIR /source
COPY . .

RUN dotnet restore "./OrdersListWeb.csproj"  --disable-parallel
RUN dotnet publish "OrdersListWeb.csproj" -c Release -o /app/publish --no-restore

FROM mcr.microsoft.com/dotnet/aspnet:6.0
WORKDIR /app
COPY --from=build /app/publish ./

EXPOSE 5000

ENTRYPOINT ["dotnet", "OrdersListWeb.dll"]
