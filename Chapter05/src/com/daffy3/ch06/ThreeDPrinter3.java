package com.daffy3.ch06;

public class ThreeDPrinter3 {

    // 예줜에는 Object 타입으로 만들었다.
    // 형 변환을 통해 데이터를 꺼내곤 했어햐 해서 번거로웠다.
    // 그래서 제네릭 타입이 탄생되었다.
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

}
