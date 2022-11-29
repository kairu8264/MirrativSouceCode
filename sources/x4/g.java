package x4;

import android.database.Cursor;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import v4.t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f59668a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f59669b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f59670c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f59671d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f59672a;

        /* renamed from: b  reason: collision with root package name */
        public final String f59673b;

        /* renamed from: c  reason: collision with root package name */
        public final int f59674c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f59675d;

        /* renamed from: e  reason: collision with root package name */
        public final int f59676e;

        /* renamed from: f  reason: collision with root package name */
        public final String f59677f;

        /* renamed from: g  reason: collision with root package name */
        public final int f59678g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f59672a = str;
            this.f59673b = str2;
            this.f59675d = z10;
            this.f59676e = i10;
            this.f59674c = c(str2);
            this.f59677f = str3;
            this.f59678g = i11;
        }

        public static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i10++;
                } else if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                    return false;
                }
            }
            return i10 == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        public static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean d() {
            return this.f59676e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f59676e != aVar.f59676e) {
                        return false;
                    }
                } else if (d() != aVar.d()) {
                    return false;
                }
                if (this.f59672a.equals(aVar.f59672a) && this.f59675d == aVar.f59675d) {
                    if (this.f59678g != 1 || aVar.f59678g != 2 || (str3 = this.f59677f) == null || b(str3, aVar.f59677f)) {
                        if (this.f59678g != 2 || aVar.f59678g != 1 || (str2 = aVar.f59677f) == null || b(str2, this.f59677f)) {
                            int i10 = this.f59678g;
                            return (i10 == 0 || i10 != aVar.f59678g || ((str = this.f59677f) == null ? aVar.f59677f == null : b(str, aVar.f59677f))) && this.f59674c == aVar.f59674c;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f59672a.hashCode() * 31) + this.f59674c) * 31) + (this.f59675d ? 1231 : 1237)) * 31) + this.f59676e;
        }

        public String toString() {
            return "Column{name='" + this.f59672a + "', type='" + this.f59673b + "', affinity='" + this.f59674c + "', notNull=" + this.f59675d + ", primaryKeyPosition=" + this.f59676e + ", defaultValue='" + this.f59677f + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f59679a;

        /* renamed from: b  reason: collision with root package name */
        public final String f59680b;

        /* renamed from: c  reason: collision with root package name */
        public final String f59681c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f59682d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f59683e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f59679a = str;
            this.f59680b = str2;
            this.f59681c = str3;
            this.f59682d = Collections.unmodifiableList(list);
            this.f59683e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f59679a.equals(bVar.f59679a) && this.f59680b.equals(bVar.f59680b) && this.f59681c.equals(bVar.f59681c) && this.f59682d.equals(bVar.f59682d)) {
                    return this.f59683e.equals(bVar.f59683e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f59679a.hashCode() * 31) + this.f59680b.hashCode()) * 31) + this.f59681c.hashCode()) * 31) + this.f59682d.hashCode()) * 31) + this.f59683e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f59679a + "', onDelete='" + this.f59680b + "', onUpdate='" + this.f59681c + "', columnNames=" + this.f59682d + ", referenceColumnNames=" + this.f59683e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: w  reason: collision with root package name */
        public final int f59684w;

        /* renamed from: x  reason: collision with root package name */
        public final int f59685x;

        /* renamed from: y  reason: collision with root package name */
        public final String f59686y;

        /* renamed from: z  reason: collision with root package name */
        public final String f59687z;

        public c(int i10, int i11, String str, String str2) {
            this.f59684w = i10;
            this.f59685x = i11;
            this.f59686y = str;
            this.f59687z = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f59684w - cVar.f59684w;
            return i10 == 0 ? this.f59685x - cVar.f59685x : i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f59688a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f59689b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f59690c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f59691d;

        public d(String str, boolean z10, List<String> list) {
            this(str, z10, list, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f59689b == dVar.f59689b && this.f59690c.equals(dVar.f59690c) && this.f59691d.equals(dVar.f59691d)) {
                    if (this.f59688a.startsWith("index_")) {
                        return dVar.f59688a.startsWith("index_");
                    }
                    return this.f59688a.equals(dVar.f59688a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f59688a.startsWith("index_") ? -1184239155 : this.f59688a.hashCode()) * 31) + (this.f59689b ? 1 : 0)) * 31) + this.f59690c.hashCode()) * 31) + this.f59691d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f59688a + "', unique=" + this.f59689b + ", columns=" + this.f59690c + ", orders=" + this.f59691d + '}';
        }

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            this.f59688a = str;
            this.f59689b = z10;
            this.f59690c = list;
            this.f59691d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), t.ASC.name()) : list2;
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f59668a = str;
        this.f59669b = Collections.unmodifiableMap(map);
        this.f59670c = Collections.unmodifiableSet(set);
        this.f59671d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(z4.g gVar, String str) {
        return new g(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    public static Map<String, a> b(z4.g gVar, String str) {
        Cursor p12 = gVar.p1("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (p12.getColumnCount() > 0) {
                int columnIndex = p12.getColumnIndex("name");
                int columnIndex2 = p12.getColumnIndex("type");
                int columnIndex3 = p12.getColumnIndex("notnull");
                int columnIndex4 = p12.getColumnIndex("pk");
                int columnIndex5 = p12.getColumnIndex("dflt_value");
                while (p12.moveToNext()) {
                    String string = p12.getString(columnIndex);
                    hashMap.put(string, new a(string, p12.getString(columnIndex2), p12.getInt(columnIndex3) != 0, p12.getInt(columnIndex4), p12.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            p12.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(z4.g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor p12 = gVar.p1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex(TtmlNode.ATTR_ID);
            int columnIndex2 = p12.getColumnIndex("seq");
            int columnIndex3 = p12.getColumnIndex("table");
            int columnIndex4 = p12.getColumnIndex("on_delete");
            int columnIndex5 = p12.getColumnIndex("on_update");
            List<c> c10 = c(p12);
            int count = p12.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                p12.moveToPosition(i10);
                if (p12.getInt(columnIndex2) == 0) {
                    int i11 = p12.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f59684w == i11) {
                            arrayList.add(cVar.f59686y);
                            arrayList2.add(cVar.f59687z);
                        }
                    }
                    hashSet.add(new b(p12.getString(columnIndex3), p12.getString(columnIndex4), p12.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            p12.close();
        }
    }

    public static d e(z4.g gVar, String str, boolean z10) {
        Cursor p12 = gVar.p1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex("seqno");
            int columnIndex2 = p12.getColumnIndex("cid");
            int columnIndex3 = p12.getColumnIndex("name");
            int columnIndex4 = p12.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (p12.moveToNext()) {
                    if (p12.getInt(columnIndex2) >= 0) {
                        int i10 = p12.getInt(columnIndex);
                        String string = p12.getString(columnIndex3);
                        String str2 = p12.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i10), string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z10, arrayList, arrayList2);
            }
            return null;
        } finally {
            p12.close();
        }
    }

    public static Set<d> f(z4.g gVar, String str) {
        Cursor p12 = gVar.p1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex("name");
            int columnIndex2 = p12.getColumnIndex(TtmlNode.ATTR_TTS_ORIGIN);
            int columnIndex3 = p12.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (p12.moveToNext()) {
                    if ("c".equals(p12.getString(columnIndex2))) {
                        String string = p12.getString(columnIndex);
                        boolean z10 = true;
                        if (p12.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e10 = e(gVar, string, z10);
                        if (e10 == null) {
                            return null;
                        }
                        hashSet.add(e10);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            p12.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f59668a;
            if (str == null ? gVar.f59668a == null : str.equals(gVar.f59668a)) {
                Map<String, a> map = this.f59669b;
                if (map == null ? gVar.f59669b == null : map.equals(gVar.f59669b)) {
                    Set<b> set2 = this.f59670c;
                    if (set2 == null ? gVar.f59670c == null : set2.equals(gVar.f59670c)) {
                        Set<d> set3 = this.f59671d;
                        if (set3 == null || (set = gVar.f59671d) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f59668a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f59669b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f59670c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f59668a + "', columns=" + this.f59669b + ", foreignKeys=" + this.f59670c + ", indices=" + this.f59671d + '}';
    }
}
