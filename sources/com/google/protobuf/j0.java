package com.google.protobuf;

import com.google.protobuf.z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface j0 {
    void A(List<Integer> list) throws IOException;

    @Deprecated
    <T> T B(fn.v<T> vVar, l lVar) throws IOException;

    <T> void C(List<T> list, fn.v<T> vVar, l lVar) throws IOException;

    void D(List<Integer> list) throws IOException;

    long E() throws IOException;

    String F() throws IOException;

    int G() throws IOException;

    void H(List<String> list) throws IOException;

    void I(List<Float> list) throws IOException;

    boolean J() throws IOException;

    int K() throws IOException;

    void L(List<f> list) throws IOException;

    void M(List<Double> list) throws IOException;

    long N() throws IOException;

    String O() throws IOException;

    long a() throws IOException;

    void b(List<Integer> list) throws IOException;

    void c(List<Long> list) throws IOException;

    boolean d() throws IOException;

    long e() throws IOException;

    void f(List<Long> list) throws IOException;

    int g() throws IOException;

    int getTag();

    void h(List<Long> list) throws IOException;

    void i(List<Integer> list) throws IOException;

    int j() throws IOException;

    int k() throws IOException;

    @Deprecated
    <T> void l(List<T> list, fn.v<T> vVar, l lVar) throws IOException;

    void m(List<Boolean> list) throws IOException;

    @Deprecated
    <T> T n(Class<T> cls, l lVar) throws IOException;

    <K, V> void o(Map<K, V> map, z.a<K, V> aVar, l lVar) throws IOException;

    void p(List<String> list) throws IOException;

    f q() throws IOException;

    int r() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    <T> T s(fn.v<T> vVar, l lVar) throws IOException;

    void t(List<Long> list) throws IOException;

    void u(List<Integer> list) throws IOException;

    long v() throws IOException;

    void w(List<Integer> list) throws IOException;

    <T> T x(Class<T> cls, l lVar) throws IOException;

    int y() throws IOException;

    void z(List<Long> list) throws IOException;
}
