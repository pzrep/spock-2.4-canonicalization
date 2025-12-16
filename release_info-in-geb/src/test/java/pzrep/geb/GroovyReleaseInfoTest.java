package pzrep.geb;

import org.codehaus.groovy.util.ReleaseInfo;

public class GroovyReleaseInfoTest {
    public void testVersion() {
        var actualVersion = ReleaseInfo.getVersion();
        assert actualVersion != null;
        assert actualVersion.matches("^([0-9]+\\.).*$") : "Actual version from ReleaseInfo: [" + actualVersion + "]";
    }

    public void testPropertiesToContainImplementationVersion() {
        var actualProperties = ReleaseInfo.getAllProperties();
        assert actualProperties != null;
        assert actualProperties.containsKey("ImplementationVersion") : "Properties do not contain 'ImplementationVersion'.";
    }

    public void testPropertiesToContainBundleVersion() {
        var actualProperties = ReleaseInfo.getAllProperties();
        assert actualProperties != null;
        assert actualProperties.containsKey("BundleVersion") : "Properties do not contain 'BundleVersion'.";
    }
}
