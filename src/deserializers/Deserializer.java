package deserializers;

import serializers.SerializerType;
import serializers.StringSerializable;

public interface Deserializer {

  StringSerializable deserialize(String serialized, SerializerType type);
}
