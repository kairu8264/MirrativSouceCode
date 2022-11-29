package bg;

import bg.e;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class k {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(bg.a aVar);

        public abstract a c(b bVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract bg.a b();

    public abstract b c();
}
