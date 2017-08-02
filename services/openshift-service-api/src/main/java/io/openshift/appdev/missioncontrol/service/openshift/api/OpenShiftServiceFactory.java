package io.openshift.appdev.missioncontrol.service.openshift.api;


import io.openshift.appdev.missioncontrol.base.identity.Identity;

/**
 * Creates {@link OpenShiftService} instances
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface OpenShiftServiceFactory {
    /**
     * Returns an {@link OpenShiftService} given it's OAuth token
     *
     * @param identity an identity
     * @return an {@link OpenShiftService}
     */
    OpenShiftService create(Identity identity);

    /**
     * Returns an {@link OpenShiftService} given it's API and Console URLs and OAuth token
     *
     * @param identity an identity
     * @return an {@link OpenShiftService}
     */
    OpenShiftService create(String apiUrl, String consoleUrl, Identity identity);
}
