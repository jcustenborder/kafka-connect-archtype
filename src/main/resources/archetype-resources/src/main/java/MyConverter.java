package ${package};

import org.apache.kafka.common.header.Header;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaAndValue;
import org.apache.kafka.connect.storage.Converter;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import java.util.Map;
import com.github.jcustenborder.kafka.connect.utils.config.Description;
import com.github.jcustenborder.kafka.connect.utils.config.Title;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationImportant;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationNote;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationTip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Description("This is a description of this connector and will show up in the documentation")
@DocumentationImportant("This is a important information that will show up in the documentation.")
@DocumentationTip("This is a tip that will show up in the documentation.")
@Title("Super Converter") //This is the display name that will show up in the documentation.
@DocumentationNote("This is a note that will show up in the documentation")
public class MyConverter implements Converter {
  private static Logger log = LoggerFactory.getLogger(MyConverter.class);

  @Override
  public void configure(Map<String, ?> settings, boolean isKey) {
    //TODO: Do your setup here.
  }

  @Override
  public byte[] fromConnectData(String s, Schema schema, Object o) {
    throw new UnsupportedOperationException(
        "This needs to be completed"
    );
  }

  @Override
  public byte[] fromConnectData(String topic, Headers headers, Schema schema, Object value) {
    throw new UnsupportedOperationException(
        "This converter requires Kafka 2.4.0 or higher with header support."
    );
  }

  @Override
  public SchemaAndValue toConnectData(String s, byte[] bytes) {
    throw new UnsupportedOperationException(
        "This needs to be completed"
    );
  }

  @Override
  public SchemaAndValue toConnectData(String topic, Headers headers, byte[] value) {
    throw new UnsupportedOperationException(
        "This converter requires Kafka 2.4.0 or higher with header support."
    );
  }
}