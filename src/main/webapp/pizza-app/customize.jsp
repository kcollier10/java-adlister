<%--
  Created by IntelliJ IDEA.
  User: kristencollier
  Date: 1/21/21
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Customize Order</title>
    </head>
    <body>

        <h3>Customize your pizza:</h3>
        <form action="/order-confirmed" method="POST">
            <label for="crust">Choose your favorite type of crust:</label>
            <select name="crust" id="crust">
                <option value="thin">Thin</option>
                <option value="handTossed">Hand-Tossed</option>
                <option value="pan">Pan</option>
                <option value="stuffed">Stuffed</option>
            </select><br>

            <label for="sauce">Choose a sauce:</label>
            <select name="sauce" id="sauce">
                <option value="none">None</option>
                <option value="tomato">Tomato</option>
                <option value="alfredo">Alfredo</option>
                <option value="buffalo">Buffalo</option>
            </select><br>

            <label for="size">Choose a size:</label>
            <select name="size" id="size">
                <option>Personal</option>
                <option>Medium</option>
                <option>Large</option>
                <option>X-Large</option>
            </select><br>

            <input type="checkbox" id="pepperoni" value="pepperoni">
            <label for="pepperoni">Pepperoni</label><br>
            <input type="checkbox" id="sausage" value="sausage">
            <label for="sausage">Sausage</label><br>
            <input type="checkbox" id="canadianBacon" value="canadianBacon">
            <label for="canadianBacon">Canadian Bacon</label><br>
            <input type="checkbox" id="chicken" value="chicken">
            <label for="chicken">Chicken</label><br><br>


             <input type="checkbox" id="mushrooms" value="mushrooms">
            <label for="mushrooms">Mushroom</label><br>
            <input type="checkbox" id="olives" value="olives">
            <label for="olives">Olives</label><br>
            <input type="checkbox" id="bananaPeppers" value="bananaPeppers">
            <label for="bananaPeppers">Banana Peppers</label><br>
            <input type="checkbox" id="spinach" value="spinach">
            <label for="spinach">Spinach</label><br><br>

            <label for="deliveryAddress">Delivery Address:</label>
            <input type="text" id="deliveryAddress" name="deliveryAddress"><br><br>

            <button type="submit">Place Order</button>
        </form>

    </body>
</html>
