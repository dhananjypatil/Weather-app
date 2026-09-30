<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.Weather" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Weather Report</title>

<link rel="stylesheet"
      href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<%
    Weather weather = (Weather) request.getAttribute("weather");
%>

<div class="weather-container">

    <div class="result-box">

        <div class="result-icon">
            🌤️
        </div>

        <h1>Weather Report</h1>

        <p class="result-subtitle">
            Current weather information
        </p>

        <div class="weather-details">

            <div class="weather-item">
                <div class="item-icon">📍</div>
                <div>
                    <span>City</span>
                    <strong><%= weather.getCity() %></strong>
                </div>
            </div>

            <div class="weather-item">
                <div class="item-icon">☁️</div>
                <div>
                    <span>Condition</span>
                    <strong><%= weather.getCondition() %></strong>
                </div>
            </div>

            <div class="weather-item">
                <div class="item-icon">🌡️</div>
                <div>
                    <span>Temperature</span>
                    <strong><%= weather.getTemperature() %></strong>
                </div>
            </div>

            <div class="weather-item">
                <div class="item-icon">💧</div>
                <div>
                    <span>Humidity</span>
                    <strong><%= weather.getHumidity() %></strong>
                </div>
            </div>

        </div>

        <a href="${pageContext.request.contextPath}/weather/index.jsp"
           class="search-again">
            🔍 Search Another City
        </a>

    </div>

</div>

</body>
</html>