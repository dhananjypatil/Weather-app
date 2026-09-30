package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Weather;
import util.WeatherAPI;
@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String city = request.getParameter("city");

        System.out.println("CITY = " + city);

        if (city == null || city.trim().isEmpty()) {
            response.sendRedirect(
                request.getContextPath() + "/weather/index.jsp"
            );
            return;
        }

        city = city.trim();

        Weather weather = WeatherAPI.getWeather(city);

        request.setAttribute("weather", weather);

        request.getRequestDispatcher(
            "/weather/weather.jsp"
        ).forward(request, response);
    }
}