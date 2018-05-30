let moduleName = 'buildium.angular-ui.compiledynamichtml';

angular.module(moduleName, [])

.directive(function CompileDynamicHtml() {
    let directive = {};

    directive.restrict = 'A';
    directive.replace = true;

    directive.link = function link(scope, ele, attrs) {
        scope.$watch(attrs.bdCompileDynamicHtml, function(html) {
            ele.html(html);
            $compile(ele.contents())(scope);
        });
    };

    return directive;
});

module.exports = moduleName;