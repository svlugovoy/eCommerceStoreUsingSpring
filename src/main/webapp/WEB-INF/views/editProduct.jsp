<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">

        <div class="page-header">
            <h1>Edit Product</h1>

            <p class="lead">Change the bellow information to edit a product:</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/productInventory/editProduct" method="post"
                   commandName="product" enctype="multipart/form-data">

       <form:hidden path="productId" value="${product.productId}" />
        
        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="productName" id="name" class="form-control" value="${product.productName}" />
        </div>

        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="camera" /> Camera</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="album" /> Album</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="frame" /> Frame</label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="productDescription" id="description" class="form-control" value="${product.productDescription}" />
        </div>

        <div class="form-group">
            <label for="price">Price</label>
            <form:input path="productPrice" id="price" class="form-control" value="${product.productPrice}" />
        </div>

        <div class="form-group">
            <label for="condition">Condition</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new" /> New</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used" /> Used</label>
        </div>

        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active" /> Active</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive" /> Inactive</label>
        </div>

        <div class="form-group">
            <label for="unitInStock">Unit In Stack</label>
            <form:input path="unitInStock" id="unitInStock" class="form-control" value="${product.unitInStock}" />
        </div>

        <div class="form-group">
            <label for="manufacturer">Manufacturer</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-control" value="${product.productManufacturer}" />
        </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Picture</label>
            <form:input path="productImage" id="productImage" type="file" class="form-input-large" />
        </div>

        <br> <br>
        <input type="submit" value="submit" class="btn btn-primary">
        <a href="<c:url value="/admin/productInventory" />" class="btn btn-warning">Cancel</a>

        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>