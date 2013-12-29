var bulletinApp = angular.module('bulletinApp', ['ngResource']);

bulletinApp.controller('PostController', function($scope, PostFactory) {
	$scope.heading = 'Bulletin Board';

	$scope.posts = PostFactory.query();

    $scope.addPost = function() {
        PostFactory.save($scope.newPost, function(resource) {
            $scope.posts.push(resource);
            $scope.newPost = {};

        }, function(response){
            console.log('Error ' + response.status);
        });
    }
});

bulletinApp.factory('PostFactory', function($resource) {
	return $resource('/bulletin/rest/post');
});