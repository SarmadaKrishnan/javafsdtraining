var app=angular.module('myApp',["ngRoute"])
app.config(function($routeProvider){
 $routeProvider.when("/one",{
	templateUrl:"one.html",
	controller:"myCtrl1"
}).when("/two",{
	templateUrl: "two.html",
	controller:"myCtrl2"
})
})
app.controller('myCtrl1',function($scope){
	$scope.msg="i am from 1st controller"
})
app.controller('myCtrl2',function($scope){
	$scope.msg="i am from 2nd controller"
})