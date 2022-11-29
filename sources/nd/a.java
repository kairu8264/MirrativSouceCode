package nd;

import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class a {
    public static final <T> AutoClearedValue<T> a(Fragment fragment) {
        jo.p.h(fragment, "<this>");
        return new AutoClearedValue<>(fragment);
    }
}
