package org.training;

import com.epam.reportportal.junit5.ReportPortalExtension;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.annotations.Listeners;
import org.training.configuration.ConfigHelper;
import org.training.configuration.ConfigHelper;

@Listeners({ReportPortalTestNGListener.class})
@ExtendWith(ReportPortalExtension.class)
public class BaseTest {
    protected static ConfigHelper configHelper = new ConfigHelper();
}
