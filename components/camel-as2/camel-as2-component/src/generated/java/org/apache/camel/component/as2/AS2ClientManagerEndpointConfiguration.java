/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.as2;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.as2.api.AS2ClientManager}.
 */
@ApiParams(apiName = "client", producerOnly = true,
           description = "Sends EDI Messages over HTTP",
           apiMethods = {@ApiMethod(methodName = "send", description="Send ediMessage to trading partner", signatures={"org.apache.hc.core5.http.protocol.HttpCoreContext send(Object ediMessage, String requestUri, String subject, String from, String as2From, String as2To, org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure, String ediMessageContentType, String ediMessageCharset, String ediMessageTransferEncoding, org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm, java.security.cert.Certificate[] signingCertificateChain, java.security.PrivateKey signingPrivateKey, org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm, String dispositionNotificationTo, String signedReceiptMicAlgorithms, org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm, java.security.cert.Certificate[] encryptingCertificateChain, String attachedFileName, String receiptDeliveryOption, String userName, String password, String accessToken)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class AS2ClientManagerEndpointConfiguration extends AS2Configuration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The access token that is used by the client for bearer authentication")})
    private String accessToken;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="AS2 name of sender")})
    private String as2From;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="The structure of AS2 to send; see AS2MessageStructure")})
    private org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="AS2 name of recipient")})
    private String as2To;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The name of the attached file or null if user doesn't want to specify it")})
    private String attachedFileName;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to compress the message or null if sending EDI message uncompressed")})
    private org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="An RFC2822 address to request a receipt or null if no receipt requested")})
    private String dispositionNotificationTo;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="EDI message to transport")})
    private Object ediMessage;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The charset of the EDI message")})
    private String ediMessageCharset;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="The content type of EDI message")})
    private String ediMessageContentType;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The transfer encoding used to transport EDI message")})
    private String ediMessageTransferEncoding;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to encrypt the message or null if sending EDI message unencrypted")})
    private org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The chain of certificates used to encrypt the message or null if sending EDI message unencrypted")})
    private java.security.cert.Certificate[] encryptingCertificateChain;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="RFC2822 address of sender")})
    private String from;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The password that is used by the client for basic authentication")})
    private String password;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The return URL that the message receiver should send an asynchronous MDN to")})
    private String receiptDeliveryOption;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="Resource location to deliver message")})
    private String requestUri;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The senders list of signing algorithms for signing receipt, in preferred order, or null if requesting an unsigned receipt.")})
    private String signedReceiptMicAlgorithms;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to sign the message or null if sending EDI message unsigned")})
    private org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The chain of certificates used to sign the message or null if sending EDI message unsigned")})
    private java.security.cert.Certificate[] signingCertificateChain;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The private key used to sign EDI message")})
    private java.security.PrivateKey signingPrivateKey;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="Message subject")})
    private String subject;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The user-name that is used for basic authentication")})
    private String userName;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAs2From() {
        return as2From;
    }

    public void setAs2From(String as2From) {
        this.as2From = as2From;
    }

    public org.apache.camel.component.as2.api.AS2MessageStructure getAs2MessageStructure() {
        return as2MessageStructure;
    }

    public void setAs2MessageStructure(org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure) {
        this.as2MessageStructure = as2MessageStructure;
    }

    public String getAs2To() {
        return as2To;
    }

    public void setAs2To(String as2To) {
        this.as2To = as2To;
    }

    public String getAttachedFileName() {
        return attachedFileName;
    }

    public void setAttachedFileName(String attachedFileName) {
        this.attachedFileName = attachedFileName;
    }

    public org.apache.camel.component.as2.api.AS2CompressionAlgorithm getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public String getDispositionNotificationTo() {
        return dispositionNotificationTo;
    }

    public void setDispositionNotificationTo(String dispositionNotificationTo) {
        this.dispositionNotificationTo = dispositionNotificationTo;
    }

    public Object getEdiMessage() {
        return ediMessage;
    }

    public void setEdiMessage(Object ediMessage) {
        this.ediMessage = ediMessage;
    }

    public String getEdiMessageCharset() {
        return ediMessageCharset;
    }

    public void setEdiMessageCharset(String ediMessageCharset) {
        this.ediMessageCharset = ediMessageCharset;
    }

    public String getEdiMessageContentType() {
        return ediMessageContentType;
    }

    public void setEdiMessageContentType(String ediMessageContentType) {
        this.ediMessageContentType = ediMessageContentType;
    }

    public String getEdiMessageTransferEncoding() {
        return ediMessageTransferEncoding;
    }

    public void setEdiMessageTransferEncoding(String ediMessageTransferEncoding) {
        this.ediMessageTransferEncoding = ediMessageTransferEncoding;
    }

    public org.apache.camel.component.as2.api.AS2EncryptionAlgorithm getEncryptingAlgorithm() {
        return encryptingAlgorithm;
    }

    public void setEncryptingAlgorithm(org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm) {
        this.encryptingAlgorithm = encryptingAlgorithm;
    }

    public java.security.cert.Certificate[] getEncryptingCertificateChain() {
        return encryptingCertificateChain;
    }

    public void setEncryptingCertificateChain(java.security.cert.Certificate[] encryptingCertificateChain) {
        this.encryptingCertificateChain = encryptingCertificateChain;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReceiptDeliveryOption() {
        return receiptDeliveryOption;
    }

    public void setReceiptDeliveryOption(String receiptDeliveryOption) {
        this.receiptDeliveryOption = receiptDeliveryOption;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getSignedReceiptMicAlgorithms() {
        return signedReceiptMicAlgorithms;
    }

    public void setSignedReceiptMicAlgorithms(String signedReceiptMicAlgorithms) {
        this.signedReceiptMicAlgorithms = signedReceiptMicAlgorithms;
    }

    public org.apache.camel.component.as2.api.AS2SignatureAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public java.security.cert.Certificate[] getSigningCertificateChain() {
        return signingCertificateChain;
    }

    public void setSigningCertificateChain(java.security.cert.Certificate[] signingCertificateChain) {
        this.signingCertificateChain = signingCertificateChain;
    }

    public java.security.PrivateKey getSigningPrivateKey() {
        return signingPrivateKey;
    }

    public void setSigningPrivateKey(java.security.PrivateKey signingPrivateKey) {
        this.signingPrivateKey = signingPrivateKey;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
