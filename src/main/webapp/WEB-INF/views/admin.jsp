<%@include file="/WEB-INF/views/template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1>Admin page</h1>

            <p class="lead">This is administrator page!</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/productInventory" />" >Product Inventory</a>
        </h3>

        <p>Here you can view, check and modify the prodbct inventory!</p>


<%@include file="/WEB-INF/views/template/footer.jsp" %>