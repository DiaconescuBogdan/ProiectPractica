<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method='html' version='1.0' encoding='UTF-8' indent='yes'/>
<xsl:template match="/">
  <html>
  <body>
  <h1>Restaurant</h1>
   <h2>Racoritaore</h2>
     <table border="1">
      <tr bgcolor="skyblue">
        <th align="left">Nume</th>
        <th align="left">Cantitate</th>
        <th align="left">Pret</th>
        <th align="left">Tip</th>
    
     </tr>


      <xsl:for-each select="Restaurant/Racoritoare">
      <tr>

        <td><xsl:value-of select="Nume"/></td>
        <td><xsl:value-of select="Cantitate"/></td>
        <td><xsl:value-of select="Pret"/></td>
        <td><xsl:value-of select="Tip"/></td>
        </tr>
      </xsl:for-each>
	</table>  

<h2>Bauturi Alcoolice</h2>
    <table border="1">
      <tr bgcolor="skyblue">
        <th align="left">Nume</th>
        <th align="left">Cantitate</th>
        <th align="left">Pret</th>
        <th align="left">Volum_Alcol</th>
    


      </tr>
<xsl:for-each select="Restaurant/BauturiAlcoolice">
      <tr>
        <td><xsl:value-of select="Nume"/></td>
        <td><xsl:value-of select="Cantitate"/></td>
        <td><xsl:value-of select="Pret"/></td>
        <td><xsl:value-of select="Volum_alcol"/></td>
        </tr>
      </xsl:for-each>
    </table>  

<h2>Fel1</h2>
    <table border="1">
      <tr bgcolor="skyblue">
        <th align="left">Nume</th>
        <th align="left">Cantitate</th>
        <th align="left">Pret</th>
        <th align="left">Ingrediente</th>
    


      </tr>
<xsl:for-each select="Restaurant/Fel1">
      <tr>
        <td><xsl:value-of select="Nume"/></td>
        <td><xsl:value-of select="Cantitate"/></td>
        <td><xsl:value-of select="Pret"/></td>
        <td><xsl:value-of select="Ingrediente"/></td>
        </tr>
      </xsl:for-each>
    </table> 

<h2>Fel2</h2>
    <table border="1">
      <tr bgcolor="skyblue">
        <th align="left">Nume</th>
        <th align="left">Cantitate</th>
        <th align="left">Pret</th>
        <th align="left">Garnitura</th>
    


      </tr>
<xsl:for-each select="Restaurant/Fel2">
      <tr>
        <td><xsl:value-of select="Nume"/></td>
        <td><xsl:value-of select="Cantitate"/></td>
        <td><xsl:value-of select="Pret"/></td>
        <td><xsl:value-of select="Garnitura"/></td>
        </tr>
      </xsl:for-each>
    </table>  

 <h2>Desert</h2>
    <table border="1">
      <tr bgcolor="skyblue">
        <th align="left">Nume</th>
        <th align="left">Cantitate</th>
        <th align="left">Pret</th>    


      </tr>
<xsl:for-each select="Restaurant/Desert">
      <tr>
        <td><xsl:value-of select="Nume"/></td>
        <td><xsl:value-of select="Cantitate"/></td>
        <td><xsl:value-of select="Pret"/></td>
        </tr>
      </xsl:for-each>
    </table>  



  </body>
  </html>
</xsl:template>
</xsl:stylesheet>