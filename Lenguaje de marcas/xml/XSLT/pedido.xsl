<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <html>
            <head>
                <title>Pedido</title>
            </head>
            <body>
                <table border="1">
                    <tr>
                        <td>Peso</td>
                        <td>RAM</td>
                        <td>Disco</td>
                        <td>Precio</td>
                    </tr>

                    <xsl:for-each select="pedido/portatiles/portatil">
                        <tr>
                            <td><xsl:value-of select="peso"/></td>
                            <td><xsl:value-of select="ram"/></td>
                            <td><xsl:value-of select="disco"/></td>
                            <td><xsl:value-of select="precio"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>