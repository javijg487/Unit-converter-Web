# Unit Converter API
This project is based on the Unit Converter project outlined on [roadmap.sh](https://roadmap.sh/). This is a unit conversion API built with Java Spring, providing endpoints for converting units of length, weight, and temperature. The API accepts requests in JSON format, allowing you to specify the value to convert, the source unit, and the target unit.

## Endpoints
### 1. Convert Weight
- **Endpoint:** `POST /api/v1/weight/convert`
- **Body Example:**
  ```json
  {
    "value": 5,
    "unitFrom": "kg",
    "unitTo": "g"
  }

### 2. Convert Temperature
- **Endpoint:** `POST /api/v1/temperature/convert`
- **Body Example:**
  ```json
  {
    "value": 100,
    "unitFrom": "C",
    "unitTo": "F"
  }

### 3. Convert Lenght
- **Endpoint:** `POST /api/v1/lenght/convert`
- **Body Example:**
  ```json
  {
    "value": 10,
    "unitFrom": "m",
    "unitTo": "cm"
  }

## Supported Units:
### Length Units:
- **Millimeter (mm)**
- **Centimeter (cm)**
- **Meter (m)**
- **Kilometer (km)**
- **Inch (in)**
- **Foot (ft)**
- **Yard (yd)**
- **Mile (mi)**

### Weight Units:
- **Milligram (mg)**
- **Gram (g)**
- **Kilogram (kg)**
- **Ounce (oz)**
- **Pound (lb)**

### Temperature Units:
- **Celsius (C)**
- **Fahrenheit (F)**
- **Kelvin (K)**

## Usage
To use the API, make a POST request to the appropriate endpoint with a JSON body that includes:

- **value:** The numeric value you wish to convert.
- **unitFrom:** The original unit of the value.
- **unitTo:** The unit to convert to.

### Example Request
For converting 5 meters to centimeters, the request body would look like this:

```json
{
  "value": 5,
  "unitFrom": "m",
  "unitTo": "cm"
}

```

### Example Request
For converting 5 meters to centimeters, the request body would look like this:

```json
{
  "value": 5,
  "unitFrom": "m",
  "unitTo": "cm"
}
```

### Running the Project
To run the project locally:

1. Clone the repository.
2. Run `mvn clean install` to build the project.
3. Start the Spring Boot application with `mvn spring-boot:run`.
4. The API will be available at `http://localhost:8080`.
