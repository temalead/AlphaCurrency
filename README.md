# AlphaCurrency

___
**Запуск приложения**

```
docker start alphac
```

___
Endpoints
```
GET /currency/{YOUR_CURRENCY}   - get delta between yesterday and today
GET /gif/{YOUR_CURRENCY}        - get gif depending of delta. if minus delta- broke else: rich
GET /gif/{YOUR_CURRENCY}/json   - get gif data in json
```