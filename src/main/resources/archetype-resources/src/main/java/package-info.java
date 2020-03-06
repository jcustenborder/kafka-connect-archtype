/**
 * This attribute is used during documentation generation to write the introduction section.
 */
@Introduction("This plugin is used to add additional JSON parsing functionality to Kafka Connect.")
/**
 * This attribute is used as the display name during documentation generation.
 */
@Title("${artifactId}")
/**
 * This attribute is used to provide the owner on the connect hub. For example jcustenborder.
 */
@PluginOwner("${groupId}")
/**
 * This attribute is used to provide the name of the plugin on the connect hub.
 */
@PluginName("${artifactId}")
package ${package};

import com.github.jcustenborder.kafka.connect.utils.config.Introduction;
import com.github.jcustenborder.kafka.connect.utils.config.PluginName;
import com.github.jcustenborder.kafka.connect.utils.config.PluginOwner;
import com.github.jcustenborder.kafka.connect.utils.config.Title;