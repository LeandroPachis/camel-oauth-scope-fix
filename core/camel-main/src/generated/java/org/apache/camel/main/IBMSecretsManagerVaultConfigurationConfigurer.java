/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.vault.IBMSecretsManagerVaultConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class IBMSecretsManagerVaultConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.vault.IBMSecretsManagerVaultConfiguration target = (org.apache.camel.vault.IBMSecretsManagerVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "ibmsecretsmanagervaultconfiguration":
        case "iBMSecretsManagerVaultConfiguration": target.setIBMSecretsManagerVaultConfiguration(property(camelContext, org.apache.camel.vault.IBMSecretsManagerVaultConfiguration.class, value)); return true;
        case "kubernetesconfigmapvaultconfiguration":
        case "kubernetesConfigMapVaultConfiguration": target.setKubernetesConfigMapVaultConfiguration(property(camelContext, org.apache.camel.vault.KubernetesConfigMapVaultConfiguration.class, value)); return true;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": target.setKubernetesVaultConfiguration(property(camelContext, org.apache.camel.vault.KubernetesVaultConfiguration.class, value)); return true;
        case "serviceurl":
        case "serviceUrl": target.setServiceUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "token": target.setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "ibmsecretsmanagervaultconfiguration":
        case "iBMSecretsManagerVaultConfiguration": return org.apache.camel.vault.IBMSecretsManagerVaultConfiguration.class;
        case "kubernetesconfigmapvaultconfiguration":
        case "kubernetesConfigMapVaultConfiguration": return org.apache.camel.vault.KubernetesConfigMapVaultConfiguration.class;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return org.apache.camel.vault.KubernetesVaultConfiguration.class;
        case "serviceurl":
        case "serviceUrl": return java.lang.String.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.vault.IBMSecretsManagerVaultConfiguration target = (org.apache.camel.vault.IBMSecretsManagerVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "ibmsecretsmanagervaultconfiguration":
        case "iBMSecretsManagerVaultConfiguration": return target.getIBMSecretsManagerVaultConfiguration();
        case "kubernetesconfigmapvaultconfiguration":
        case "kubernetesConfigMapVaultConfiguration": return target.getKubernetesConfigMapVaultConfiguration();
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return target.getKubernetesVaultConfiguration();
        case "serviceurl":
        case "serviceUrl": return target.getServiceUrl();
        case "token": return target.getToken();
        default: return null;
        }
    }
}

