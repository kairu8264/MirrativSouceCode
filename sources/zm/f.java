package zm;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class f {
    public static f INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
