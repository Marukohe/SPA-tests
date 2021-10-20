# 软件分析实验测试

## 使用方法

```
cd <path>/<to>/<tai-e>
git submodule add https://github.com/Marukohe/SPA-tests.git src/test/resources/SPA-tests
cp src/test/resources/SPA-tests/JunitTest/DeadCodeSPATests.java src/test/java/pascal/tai/analysis/dataflow/analysis
```

## 添加测试

将仓库fork一份，编写.java测试文件，向JunitTest中添加测试方法，然后提交PR到仓库中，会生成expected文件（当然不是标准答案，错了记得反馈😐）
