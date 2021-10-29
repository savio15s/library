<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %> <%@
taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
  <body>
    <h1>ADD BOOK</h1>
    <form action="addBook">
      <input type="text" name="bookId" /><br />
      <input type="text" name="quantity" /><br />
      <input type="text" name="bookName" /><br />
      <input type="text" name="genre" /><br />

      <input type="submit" /><br />
    </form>
  </body>
</html>
