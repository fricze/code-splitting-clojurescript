# Code Splitting ClojureScript

This is the example code used in the [Code Splitting ClojureScript](https://code.thheller.com/blog/shadow-cljs/2019/03/03/code-splitting-clojurescript.html) article.

You can compile it by cloning the repo and running

```
npm install
npx shadow-cljs watch app
;; or
npx shadow-cljs release app
```

and then open http://localhost:8000.

## Why

Because @thheller original solution forces props given to lazy loaded components to be transformed to JS and that *really* spoils the fun. We're losing React Suspense semantics here but it's way easier to just go with reagent atom and avoid React Suspense and React lazy.
