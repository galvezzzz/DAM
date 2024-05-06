<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.1">
    <xsl:template match="/">
        <ayudas>
            <animales>
                <for-each select="animales/libertad">
                    <ejemplar>
                        <xsl:attribute name="familia">
                            <xsl:value-of select="nombre/@familia"></xsl:value-of>
                        </xsl:attribute>
                        <ingreso>
                            <xsl:value-of select="fechaingreso"></xsl:value-of>
                        </ingreso>
                        <nombre>
                            <xsl:value-of select="nombre"></xsl:value-of>
                        </nombre>
                        <inversion>
                            <xsl:value-of select="inversion"></xsl:value-of>
                            <xsl:value-of select="inversion/@moneda"></xsl:value-of>
                        </inversion>
                    </ejemplar>
                </for-each>
            </animales>

            <espacios>
                <for-each select="animales/cautividad">
                    <xsl:attribute name="zooasociado">
                        <xsl:value-of select="zooasociado"></xsl:value-of>
                    </xsl:attribute>
                    <cantidad>
                        <xsl:value-of select="datos/cantidad"></xsl:value-of>
                    </cantidad>
                    <moneda>
                        <xsl:value-of select="datos/moneda"></xsl:value-of>
                    </moneda>
                </for-each>
            </espacios>
        </ayudas>
    </xsl:template>
</xsl:stylesheet>