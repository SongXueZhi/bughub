# BugHub
A platform(frontend + backend + database) that supports bug management, bug labeling, real-time debugging .etc.

[![Video Thumbnail](https://github.com/SongXueZhi/bughub/blob/main/platform-web/pn.jpg)](https://www.bilibili.com/video/BV1HgmPYzEXq)

(Logged in to bilibili is recommended for high-quality video)

## Directory Structure

/platform-web: source of frontend

/platform: source of backend

/ddl: bug table, defined bug data structure in database(Mysql).



## Environment & Run
### Platform

JDK **11**
Maven

You can build the *platform* directory by maven.



Enter into /platform directory: 

```
mvn clean install

java -jar ./target/RegMiner-Backend-0.0.1-SNAPSHOT.jar 
```

tip: You may build failure if you use other JDK versions.



## Web UI

You can build the *platform-web* directory by npm.

This module supports the Web UI of BugHub, powered by React and  [Monaco](https://microsoft.github.io/monaco-editor/). Follow the steps:

1. Install dependencies

```
npm install
```

> Except the first and the last step, if any error or warning is reported, you may try to install these followings
> dependencies to solve the problem. Otherwise, ignore it.

2. In order to install 'react-monaco-editor' and 'monaco-editor-webpack-plugin'

```
npm add react-monaco-editor
npm install monaco-editor-webpack-plugin
```

if monaco continues to report error, re-install 'monaco-editor'

```
npm install monaco-editor
```

3. In order to install 'core-js' or 'core-js@3.18.3'

```
npm install core-js
npm install --save core-js@3.18.3
```

4. In order to install 'blueprintjs'

```
npm install --save @blueprintjs/core
```

5. In order to let Typescript automatic generated 'uuid'

```
npm install --save @types/uuid
```

6. '@umi/' Installation tutorial: https://www.cnblogs.com/zhaoxxnbsp/p/12672652.html#2%E5%AE%89%E8%A3%85

7. When the terminal shows compile errors, you can refer to following installs

```
npm i @ant-design/pro-card@1.18.0 --save
npm i @ant-design/pro-form@1.50.0 --save
npm i @ant-design/pro-table@2.61.0 --save
```

8. When `export 'ReactReduxContext' (imported as 'ReactReduxContext') was not found in 'react-redux' ` Warning appears

```
npm install react-redux@7.2.4
```

9. Run project (support and suggest to use mock data )

```
yarn start
```

## 







