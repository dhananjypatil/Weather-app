<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Weather App</title>

<link rel="stylesheet"
      href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="weather-container">

    <div class="weather-box">

        <div class="weather-icon">
            🌤️
        </div>

        <h1>Weather App</h1>

        <p class="subtitle">
            Check the current weather of any city
        </p>

        <form
            action="${pageContext.request.contextPath}/weather"
            method="post">

            <label>
                Enter City Name
            </label>

            <div class="search-box">

                <input
                    type="text"
                    name="city"
                    placeholder="e.g. Bhopal"
                    required>

                <button type="submit">
                    Search
                </button>

            </div>

        </form>

        <div class="examples">

            <span>Try:</span>

            <span>Bhopal</span>
            <span>Indore</span>
            <span>Pune</span>
            <span>Delhi</span>

        </div>

    </div>

</div>

</body>

</html>