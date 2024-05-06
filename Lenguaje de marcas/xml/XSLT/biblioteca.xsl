<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <html>
            <head>
            Biblioteca Tipo Examen
            </head>
            <body>
                <h1>Actividad 1</h1>

                <ol>
                    <xsl:for-each select="biblioteca/libro/autores">
                        <xsl:if test="autor/@nacimiento > 1900">
                            <li>
                                <xsl:value-of select="../titulo"></xsl:value-of>
                            </li>
                        </xsl:if>
                    </xsl:for-each>
                </ol>

                <h1>Actividad 2</h1>

                <ol>
                    <xsl:for-each select="biblioteca/libro/autores/autor">
                        <xsl:sort order="descending" select="."></xsl:sort>
                        <li>
                            <xsl:value-of select="."></xsl:value-of>
                        </li>
                    </xsl:for-each>
                </ol>

                <h1>Actividad 3</h1>

                <ol>
                    <xsl:for-each select="biblioteca/libro/autores/autor">
                        <xsl:if test="@nacimiento > 1900">
                            <li>
                                <xsl:value-of select="."></xsl:value-of>
                            </li>
                        </xsl:if>
                    </xsl:for-each>
                </ol>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>