<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <html>
            <head>
                <title>Ejercicio 2</title>
            </head>

            <body>
                <table border = "1">
                    <xsl:for-each select="pedido/portatiles/portatil">
                        <xsl:if test="ram &gt; 2">
                            <tr>
                                <td>Peso: <xsl:value-of select="peso"/>
                                </td>
                                <td>RAM: <xsl:value-of select="ram"/>
                                </td>
                                <td>Disco: <xsl:value-of select="disco"/>
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>

                    <xsl:for-each select="pedido/tablets/tablet">
                        <xsl:if test="caracteristicas/memoria &gt; 2">
                            <xsl:if test="caracteristicas/tamanio &gt; 7">
                                <tr>
                                    <td><xsl:value-of select="plataforma"/>
                                    </td>
                                    <td><xsl:value-of select="caracteristicas/memoria"/>
                                    </td>
                                    <td><xsl:value-of select="caracteristicas/tamanio"/>
                                    </td>
                                </tr>
                            </xsl:if>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>