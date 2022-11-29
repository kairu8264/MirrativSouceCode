package s3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public interface o {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
