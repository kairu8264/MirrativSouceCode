package e3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f30182a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f30183b;

    /* renamed from: c  reason: collision with root package name */
    public int f30184c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f30182a = shader;
        this.f30183b = colorStateList;
        this.f30184c = i10;
    }

    public static d a(Resources resources, int i10, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(f.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(int i10) {
        return new d(null, null, i10);
    }

    public static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f30184c;
    }

    public Shader f() {
        return this.f30182a;
    }

    public boolean h() {
        return this.f30182a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f30182a == null && (colorStateList = this.f30183b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f30183b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f30184c) {
                this.f30184c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f30184c = i10;
    }

    public boolean l() {
        return h() || this.f30184c != 0;
    }
}
