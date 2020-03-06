package ${package};

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Type;
import org.apache.kafka.common.config.ConfigDef.Importance;
import com.github.jcustenborder.kafka.connect.utils.config.ConfigKeyBuilder;

import java.util.Map;


public class MyKeyValueTransformationConfig extends AbstractConfig {

  public static final String MY_SETTING_CONFIG = "my.setting";
  private static final String MY_SETTING_DOC = "This is a setting important to my connector.";

  public final String mySetting;

  public MyKeyValueTransformationConfig(Map<?, ?> originals) {
    super(config(), originals);
    this.mySetting = this.getString(MY_SETTING_CONFIG);
  }

  public static ConfigDef config() {
    return new ConfigDef()
        .define(
            ConfigKeyBuilder.of(MY_SETTING_CONFIG, Type.STRING)
                .documentation(MY_SETTING_DOC)
                .importance(Importance.HIGH)
                .build()
        );
  }
}
