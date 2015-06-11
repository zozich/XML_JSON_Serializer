package groups;

import serializers.SerializeManager;
import serializers.SerializerType;
import serializers.StringSerializable;
import java.util.ArrayList;

public class Group extends ArrayList<StringSerializable> implements StringSerializable {

  @Override
  public String serialize(SerializerType type) {
    return new SerializeManager().getSerializedValue(this, type);
  }
}
