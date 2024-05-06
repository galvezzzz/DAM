<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <html>
            <head>
                <title>Premios XSL</title>
            </head>

            <body>

                <h1>Apartado 1</h1>
                <ul>
                    <xsl:for-each select="premios/Nobel">
                        <li> Premio Nobel de <xsl:value-of select="@año"></xsl:value-of>
                        </li>

                        <ul>
                            <li> Especialidad: <xsl:value-of select="especialidad"></xsl:value-of>
                            </li>
                            <li>
                                <xsl:value-of select="ganadores/ganador"></xsl:value-of> de <xsl:value-of select="ganadores/ganador/@pais"></xsl:value-of>
                            </li>
                        </ul>
                    </xsl:for-each>
                </ul>

                <h1>Apartado 2</h1>
                <ol>
                    <xsl:for-each select="premios/Nobel">
                        <xsl:choose>
                            <xsl:when test="ganadores/ganador/@pais = 'España'">
                                <li>
                                    <xsl:value-of select="especialidad"></xsl:value-of>
                                </li>
                            </xsl:when>
                        </xsl:choose>
                    </xsl:for-each>
                </ol>

                <h1>Apartado 3</h1>
                <ol>
                    <xsl:for-each select="premios/Nobel/ganadores/ganador">
                        <xsl:sort order="descending" />
                        <li>
                            <xsl:value-of select="."></xsl:value-of>
                        </li>
                    </xsl:for-each>
                </ol>

                <h1>Apartado 4</h1>
                <table border="1">
                    <tr>
                        <th colspan="3">PREMIOS NOBEL DE FÍSICA</th>
                    </tr>
                    <tr>
                        <td>Año</td>
                        <td>Ganador</td>
                        <td>Nacionalidad</td>
                    </tr>

                    <xsl:for-each select="premios/Nobel/ganadores/ganador">
                        <xsl:choose>
                            <xsl:when test="../../especialidad = 'Física'">
                                <tr>
                                    <td>
                                        <xsl:value-of select="../../@año"></xsl:value-of>
                                    </td>
                                    <td>
                                        <xsl:value-of select="."></xsl:value-of>
                                    </td>
                                    <td>
                                        <xsl:value-of select="@pais"></xsl:value-of>
                                    </td>
                                </tr>
                            </xsl:when>
                        </xsl:choose>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>