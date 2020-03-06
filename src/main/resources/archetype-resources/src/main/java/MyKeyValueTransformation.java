package ${package};

import com.github.jcustenborder.kafka.connect.utils.config.Description;
import com.github.jcustenborder.kafka.connect.utils.config.Title;
import com.github.jcustenborder.kafka.connect.utils.transformation.BaseKeyValueTransformation;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.connect.connector.ConnectRecord;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaAndValue;
import org.apache.kafka.connect.errors.DataException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Title("Super Cool Transformation")
@Description("This transformation will change one record to another record.")
public class MyKeyValueTransformation<R extends ConnectRecord<R>> extends BaseKeyValueTransformation<R> {
  MyKeyValueTransformationConfig config;

  protected MyKeyValueTransformation(boolean isKey) {
    super(isKey);
  }

  @Override
  public ConfigDef config() {
    return MyKeyValueTransformationConfig.config();
  }

  @Override
  public void close() {

  }

  @Override
  protected SchemaAndValue processBytes(R record, Schema inputSchema, byte[] input) {
    throw new UnsupportedOperationException("This method will execute against byte arrays.");
  }

  @Override
  protected SchemaAndValue processString(R record, Schema inputSchema, String input) {
    throw new UnsupportedOperationException("This method will execute against Strings.");
  }

  @Override
  public void configure(Map<String, ?> map) {
    this.config = new MyKeyValueTransformationConfig(map);
  }

  /**
   * This implementation works against the key of the record.
   * @param <R>
   */
  public static class Key<R extends ConnectRecord<R>> extends MyKeyValueTransformation<R> {
    public Key() {
      super(true);
    }
  }

  /**
   * This implementation works against the value of the record.
   * @param <R>
   */
  public static class Value<R extends ConnectRecord<R>> extends MyKeyValueTransformation<R> {
    public Value() {
      super(false);
    }
  }
}