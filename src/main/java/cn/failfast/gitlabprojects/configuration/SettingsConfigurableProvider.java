package cn.failfast.gitlabprojects.configuration;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Provider of SettingsConfigurable
 *
 * @author ppolivka
 * @since 9.10.2015
 */
public class SettingsConfigurableProvider extends ConfigurableProvider {

    @Nullable
    @Override
    public Configurable createConfigurable() {
        SettingsView settingsView = new SettingsView();
        settingsView.setup();
        return settingsView;
    }

}
