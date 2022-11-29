package v1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import g1.c;
import jo.p;
import org.xmlpull.v1.XmlPullParserException;
import v1.d;

/* loaded from: classes.dex */
public final class g {
    public static final d.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser) throws XmlPullParserException {
        p.h(resources, "res");
        p.h(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        h1.a aVar = new h1.a(xmlResourceParser, 0, 2, null);
        p.g(asAttributeSet, "attrs");
        c.a a10 = h1.c.a(aVar, resources, theme, asAttributeSet);
        int i10 = 0;
        while (!h1.c.d(xmlResourceParser)) {
            i10 = h1.c.g(aVar, resources, asAttributeSet, theme, a10, i10);
            xmlResourceParser.next();
        }
        return new d.a(a10.f(), aVar.a());
    }
}
