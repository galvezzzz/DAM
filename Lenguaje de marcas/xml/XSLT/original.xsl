<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <datos>
            <cuentas>
                <xsl:for-each select="listado/cuenta"></xsl:for-each>
                <cuenta>
                    <xsl:attribute name="dnititular">
                        <xsl:value-of select="titular/@dni"></xsl:value-of>
                    </xsl:attribute>

                    <creacion>
                        <xsl:value-of select="fechacreacion"/>
                    </creacion>
                </cuenta>


            </cuentas>

            <fondos>
                <fondo>

                </fondo>
                <fondo>

                </fondo>
            </fondos>
        </datos>
    </xsl:template>
</xsl:stylesheet>
