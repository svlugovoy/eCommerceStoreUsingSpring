<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1>Register Customer</h1>

            <p class="lead">Please fill in your information bellow:</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/register" method="post"
                   commandName="customer">

        <div class="col-md-4">
            <h3>Basic info</h3>

            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="customerName" id="name" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="email">Email</label>
                <form:input path="customerEmail" id="email" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="phone">Phone</label>
                <form:input path="customerPhone" id="phone" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="username">Username</label>
                <form:input path="username" id="username" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <form:password path="password" id="password" class="form-control"/>
            </div>
        </div>

        <div class="col-md-4">
            <h3>Billing Address</h3>

            <div class="form-group">
                <label for="billingStreetName">Street Name</label>
                <form:input path="billingAddress.streetName" id="billingStreetName" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingApartmentNumber">Apartment Number</label>
                <form:input path="billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingCity">City</label>
                <form:input path="billingAddress.city" id="billingCity" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingState">State</label>
                <form:input path="billingAddress.state" id="billingState" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingCountry">Country</label>
                <form:input path="billingAddress.country" id="billingCountry" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingZipCode">Zip Code</label>
                <form:input path="billingAddress.zipCode" id="billingZipCode" class="form-control"/>
            </div>
        </div>

        <div class="col-md-4">
            <h3>Shipping Address</h3>

            <div class="form-group">
                <label for="shippingStreetName">Street Name</label>
                <form:input path="shippingAddress.streetName" id="shippingStreetName" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingApartmentNumber">Apartment Number</label>
                <form:input path="shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCity">City</label>
                <form:input path="shippingAddress.city" id="shippingCity" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingState">State</label>
                <form:input path="shippingAddress.state" id="shippingState" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCountry">Country</label>
                <form:input path="shippingAddress.country" id="shippingCountry" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingZipCode">Zip Code</label>
                <form:input path="shippingAddress.zipCode" id="shippingZipCode" class="form-control"/>
            </div>
        </div>


        <br> <br>
        <input type="submit" value="submit" class="btn btn-primary">
        <a href="<c:url value="/" />" class="btn btn-warning">Cancel</a>

        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>