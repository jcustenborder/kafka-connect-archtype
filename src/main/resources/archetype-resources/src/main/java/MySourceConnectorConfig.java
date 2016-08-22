package ${package};

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Type;
import org.apache.kafka.common.config.ConfigDef.Importance;

import java.util.Map;


public class MySourceConnectorConfig extends AbstractConfig {

  public static final String MY_SETTING_CONFIG = "my.setting";
  private static final String MY_SETTING_DOC = "This is a setting important to my connector.";

  public MySourceConnectorConfig(ConfigDef config, Map<String, String> parsedConfig) {
    super(config, parsedConfig);
  }

  public MySourceConnectorConfig(Map<String, String> parsedConfig) {
    this(conf(), parsedConfig);
  }

  public static ConfigDef conf() {
    return new ConfigDef()
        .define(MY_SETTING_CONFIG, Type.STRING, Importance.HIGH, MY_SETTING_DOC);
  }

  public String getMy(){
    return this.getString(MY_SETTING_CONFIG);
  }
}
